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
        String mid = req.getParameter("mid");
        if ("getMemberByMid".equals(uri)) {
            new MemberController().getMemberByMid(mid);
        } else if ("getOrderByMid".equals(uri)) {
            new OrderController().getOrderByMid(mid);
        } else if ("getSystemByMid".equals(uri)) {
            new SystemController().getSystemByMid(mid);
        }

    }

}
