<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="resources/css/foundation/foundation.css" rel="stylesheet" />
<link href="resources/css/foundation/normalize.css" rel="stylesheet" />
<link href="resources/css/style.css" rel="stylesheet" />

<title>Struts2 webapp</title>

</head>
<body>
  <div class="row">
    <div class="large-12 columns">
      <div class="panel">
        <div class="row">
            <div class="large-2 columns"><h1>Blog</h1></div>
            <div class="large-2 columns"> <h6><s:a action="addPost">Crear post</s:a></h6> </div>
            </div>
        </div>
      </div>
    </div>
  </div>
   
  <div class="row">
  
    <div class="large-3 columns ">
      <div class="panel">
        <a href="#"><img alt="Anuncio" height="300" width="240" src="http://placehold.it/300x240&text=[img]"/></a>
          <div class="section-container vertical-nav" data-section data-options="deep_linking: false; one_up: true">
          <section class="section">
            <h5 class="title"><a href="#">Section 1</a></h5>
          </section>
          <section class="section">
            <h5 class="title"><a href="#">Section 2</a></h5>
          </section>
          <section class="section">
            <h5 class="title"><a href="#">Section 3</a></h5>
          </section>
          <section class="section">
            <h5 class="title"><a href="#">Section 4</a></h5>
          </section>
          <section class="section">
            <h5 class="title"><a href="#">Section 5</a></h5>
          </section>
          <section class="section">
            <h5 class="title"><a href="#">Section 6</a></h5>
          </section>
        </div>
 
      </div>
    </div>
    
     
     
    <div class="large-6 columns">
 
      <s:iterator value="posts">
        <div class="row">
          <div class="large-2 columns small-3"><img src="https://randomuser.me/api/portraits/thumb/lego/6.jpg" class="face"/></div>
          <div class="large-10 columns">
            <p>
              <strong><s:property value="blogPost.user"/> dijo:</strong>
              <s:property value="blogPost.post"/>
            </p>
            <ul class="inline-list">
              <li><a href="">Reply</a></li>
              <li><a href="">Share</a></li>
            </ul>
            
            <div>
              <h6>2 Comments</h6>
              <div class="row">
                <div class="large-2 columns small-3"><img src="http://placehold.it/50x50&text=[img]"/></div>
                <div class="large-10 columns"><p>Bacon ipsum dolor sit amet nulla ham qui sint exercitation eiusmod commodo, chuck duis velit. Aute in reprehenderit</p></div>
              </div>
              <div class="row">
                <div class="large-2 columns small-3"><img src="http://placehold.it/50x50&text=[img]"/></div>
                <div class="large-10 columns"><p>Bacon ipsum dolor sit amet nulla ham qui sint exercitation eiusmod commodo, chuck duis velit. Aute in reprehenderit</p></div>
              </div>
            </div>
            
          </div>
        </div>
      </s:iterator>
 
      <hr/>      
 
    </div>
   
    <aside class="large-3 columns hide-for-small">
      <p><img src="http://placehold.it/300x440&text=[ad]"/></p>
      <p><img src="http://placehold.it/300x440&text=[ad]"/></p>
    </aside>
 
  </div>
  
  <footer class="row">
    <div class="large-12 columns">
      <hr/>
      <div class="row">
        <div class="large-5 columns">
          <p>© Copyright no one at all.</p>
        </div>
        <div class="large-7 columns">
          <ul class="inline-list right">
            <li><a href="#">Section 1</a></li>
            <li><a href="#">Section 2</a></li>
            <li><a href="#">Section 3</a></li>
            <li><a href="#">Section 4</a></li>
            <li><a href="#">Section 5</a></li>
            <li><a href="#">Section 6</a></li>
          </ul>
        </div>
      </div>
    </div>
  </footer>
    
  <script src="resources/js/jquery.js" type="text/javascript"></script>
  <script src="resources/js/fastclick.js" type="text/javascript"></script>
  <script src="resources/js/foundation/foundation.min.js" type="text/javascript"></script>  
</body>
</html>