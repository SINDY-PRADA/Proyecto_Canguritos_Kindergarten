<%
  HttpSession sesion = (HttpSession)request.getSession();

  if(sesion.getAttribute("username")!= null){
    String nombre= String.valueOf(request.getAttribute("username"));
  }else{
    response.sendRedirect("login.jsp");
  }

%>