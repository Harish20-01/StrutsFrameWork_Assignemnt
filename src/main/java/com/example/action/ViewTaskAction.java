package com.example.action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import com.example.model.TaskStore;

public class ViewTaskAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {

        request.setAttribute("tasks", TaskStore.getTasks());
        return mapping.findForward("success");
    }
}