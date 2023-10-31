import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.lang.reflect.*;

public class EventTracer
{
   public EventTracer()
   {

      handler = new
         InvocationHandler()
         {
            public Object invoke(Object proxy,
               Method method, Object[] args)
            {
               System.out.println(method + ":" + args[0]);
               return null;
            }
         };
   }
   public void add(Component c)
   {
      try
      {
         BeanInfo info = Introspector.getBeanInfo(c.getClass());
         EventSetDescriptor[] eventSets
            = info.getEventSetDescriptors();
         for (int i = 0; i < eventSets.length; i++)
            addListener(c, eventSets[i]);
      }
      catch (IntrospectionException exception) {}
      if (c instanceof Container)
      {
         Component[] a = ((Container)c).getComponents();
         for (int i = 0; i < a.length; i++)
            add(a[i]);
      }
   }
   public void addListener(Component c,
      EventSetDescriptor eventSet)
   {
      Object proxy = Proxy.newProxyInstance(null,
         new Class[] { eventSet.getListenerType() }, handler);
      Method addListenerMethod
         = eventSet.getAddListenerMethod();
      try
      {
         addListenerMethod.invoke(c, new Object[] { proxy });
      }
      catch(InvocationTargetException e) {}
      catch(IllegalAccessException e) {}
   }
   private InvocationHandler handler;
}
