package com.service;


public class MainService {

    private ISubService service;

    MainService(ISubService service){
        this.service=service;
    }

    public String generateString(){
        return "prefix_"+ service.getRandomNumber();
    }

    public void setService(ISubService service) {
        this.service = service;
    }

    public ISubService getService() {
        return service;
    }
}
