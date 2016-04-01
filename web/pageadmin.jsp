<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Electronix Store - Details</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/windowopen.js"></script>
<script type="text/javascript" src="js/boxOver.js"></script>
</head>
<body>
<div id="main_container">
  <div class="top_bar">
    <div class="top_search">
      <div class="search_text">
      <%  
      out.println("Hellow , " +request.getSession().getAttribute("UserName"));        
        %>  
        
        
    </div>
  </div>
  <div id="header">
    <div id="logo"> <a href=""><img src="images/logo.png" alt="" border="0" width="237" height="140" /></a> </div>
    <div class="oferte_content">
      <div class="top_divider"><img src="images/header_divider.png" alt="" width="1" height="164" /></div>
      <div class="oferta">
        <div class="oferta_content"> <img src="images/laptop.png" width="94" height="92" alt="" border="0" class="oferta_img" />
          <div class="oferta_details">
            <div class="oferta_title">Samsung GX 2004 LM</div>
            <div class="oferta_text"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>
            <a href="details.html" class="details">details</a> </div>
        </div>
        <div class="oferta_pagination"> <span class="current">1</span> <a href="">2</a> <a href="">3</a> <a href="">4</a> <a href="">5</a> </div>
      </div>
      <div class="top_divider"><img src="images/header_divider.png" alt="" width="1" height="164" /></div>
    </div>
    <!-- end of oferte_content-->
  </div>
  <div id="main_content">
    <div id="menu_tab">
      <div class="left_menu_corner"></div>
      <ul class="menu" >
        
        <li><a href="pageadmin.jsp" class="nav1"> Home</a></li>
        <li class="divider"></li>
        <li><a href="DisplayProudct" class="nav2">Products</a></li>
       
        <li><a href="AddUser.jsp" class="nav4">Add User</a></li>
        <li class="divider"></li>
        <li><a href="DisplayUser" class="nav5">Display Users </a></li>
        <li class="divider"></li>
        <li><a href="CreateProduct.jsp" class="nav6">Add New Products</a></li>
          <li><a href="logout" class="nav5">Log out</a></li>
         
        <li class="divider"></li>
      
      </ul>
      <div class="right_menu_corner"></div>
    </div>
    <!-- end of menu tab -->
    <div class="crumb_navigation"> Navigation: <a href="">Home</a> &lt; <span class="current">Category name</span> </div>
    <!-- end of left content --><!-- end of center content --><!-- end of right content -->
  </div>
  <!-- end of main content -->
  <div class="footer">
    <div class="right_footer"> <a href="">home</a> <a href="">about</a> <a href="">sitemap</a> <a href="">rss</a> <a href="contact.html">contact us</a> </div>
  </div>
</div>
<!-- end of main_container --></body>
</html>
