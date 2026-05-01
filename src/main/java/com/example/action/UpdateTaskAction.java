package com.example.action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import com.example.model.TaskStore;

public class UpdateTaskAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {

        int index = Integer.parseInt(request.getParameter("id"));
        String task = request.getParameter("task");

        TaskStore.updateTask(index, task);

        return mapping.findForward("view");
    }
}