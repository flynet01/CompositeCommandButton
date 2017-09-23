package org.sample.jsf.client.view.search;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class SearchSessionScoped implements Serializable {

    /** Serial version UID. */
    private static final long serialVersionUID = -4966685387777336734L;

    /**
     * The search criteria.
     */
    private SearchCriteria criteria;

    public SearchCriteria getCriteria() {
        return criteria;
    }

    public void setCriteria(SearchCriteria criteria) {
        this.criteria = criteria;
    }
}
