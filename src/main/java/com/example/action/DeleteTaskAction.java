package com.example.action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import com.example.model.TaskStore;

public class DeleteTaskAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {

        int index = Integer.parseInt(request.getParameter("id"));
        TaskStore.deleteTask(index);

        return mapping.findForward("view");
    }
}