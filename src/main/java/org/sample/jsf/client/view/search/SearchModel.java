package org.sample.jsf.client.view.search;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ViewScoped
public class SearchModel {

    /** Serial version UID. */
    private static final long serialVersionUID = -4966685387777336734L;

    /** The session. */
    @Inject
    private SearchSessionScoped session;

    public SearchSessionScoped getSession() {
        return session;
    }

    public SearchCriteria getCriteria() {
        if(getSession().getCriteria() == null){
            setCriteria(new SearchCriteria());
        }
        return getSession().getCriteria();
    }

    public void setCriteria(final SearchCriteria criteria) {
        getSession().setCriteria((SearchCriteria) criteria);
    }


}
