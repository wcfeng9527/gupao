package springMVC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangchunfeng
 * @create 2019-03-26 11:54
 */
@WebServlet(name = "DispatchServlet",urlPatterns = "/*")
public class DispatchServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispathch(req, resp);
    }

    private void doDispathch(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        System.out.println(uri);
        String mid = req.getParameter("mid");
        if (uri.indexOf("getMemberByMid")!=-1) {
            new MemberController().getMemberByMid(mid);
        } else if (uri.indexOf("getOrderByMid")!=-1) {
            new OrderController().getOrderByMid(mid);
        } else if (uri.indexOf("getSystemByMid")!=-1) {
            new SystemController().getSystemByMid(mid);
        }

    }

}
