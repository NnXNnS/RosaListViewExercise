package com.bcaf.ivan.listviewexercise.Util;

import com.bcaf.ivan.listviewexercise.ApiService;
import com.bcaf.ivan.listviewexercise.ContactService;

public class ContactUtil {
    public ContactUtil() {
    }

    public ContactService getContact(){
        return ApiService.getClient().create(ContactService.class);
    }
}
