package com.multicampus.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multicampus.service.ISimpleBbsService;

@Controller
public class MyController {

    @Autowired
    private ISimpleBbsService bbs;

    @RequestMapping("/")
    public String root() throws Exception {

        return "redirect:list";
    }

    @RequestMapping("/list")
    public String userListPage(Model model) {
        model.addAttribute("list", bbs.list());
        int totalCount = bbs.count();
        System.out.println("Count : " + totalCount);
        return "list";
    }

    @RequestMapping("/view")
    public String userViewPage(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        model.addAttribute("dto", bbs.view(id));

        return "view";
    }

    @RequestMapping("/writeForm")
    public String userwritePage() {

        return "writeForm";
    }


    @RequestMapping("/write")
    public String userinsertPage(HttpServletRequest request, Model model) {
        String sName = request.getParameter("writer");
        String sTitle = request.getParameter("title");
        String sContent = request.getParameter("content");

        Map<String, String> map = new HashMap<>();
        map.put("item1", sName);
        map.put("item2", sTitle);
        map.put("item3", sContent);

        int nResult = bbs.write(map);
        System.out.println("Write : " + nResult);

        return "redirect:list";
    }

    @RequestMapping("/delete")
    public String userdeletePage(HttpServletRequest request, Model model) {
        String sId = request.getParameter("id");
        int nResult = bbs.delete(sId);
        System.out.println("Delete : " + nResult);

        return "redirect:list";
    }

}
