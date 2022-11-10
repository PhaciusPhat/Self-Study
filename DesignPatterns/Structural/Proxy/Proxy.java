package Structural.Proxy;

import Structural.Proxy.ProtectionProxy.Service;
import Structural.Proxy.ProtectionProxy.ServiceProxy;

public class Proxy {
    public static void main(String[] args) throws Exception{
        Service service = new ServiceProxy("admin");
        service.getName();
        Service service2 = new ServiceProxy("hello");
        service2.getName();
    }
}
