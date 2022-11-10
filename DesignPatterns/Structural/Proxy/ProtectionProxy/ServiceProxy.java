package Structural.Proxy.ProtectionProxy;

public class ServiceProxy implements Service{
    private ServiceImpl service;

    public ServiceProxy(String authority) throws Exception{
        if (authority.equals("admin")){
            service = new ServiceImpl();
        } else{
            throw new Exception("Cút");
        }
    }



    @Override
    public void getName() {
        System.out.println(service.hashCode());
        service.getName();
    }
}
