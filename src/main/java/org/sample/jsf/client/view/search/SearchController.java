package org.sample.jsf.client.view.search;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SearchController {

    private static final long serialVersionUID = -1625566649081574918L;

    @Inject
    private SearchModel model;

    protected SearchModel getModel() {
        return model;
    }

    public String onSearch() {
        System.out.println("I'm in!");
        return "Here I am";
    }

}
