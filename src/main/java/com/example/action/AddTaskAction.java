package com.example.action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import com.example.model.TaskStore;

public class AddTaskAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {

        String task = request.getParameter("task");

        if (task != null && !task.trim().isEmpty()) {
            TaskStore.addTask(task);
        }

        return mapping.findForward("view");
    }
}