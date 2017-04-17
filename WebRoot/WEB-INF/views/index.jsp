<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<style>
#myCarousel{
	margin-top:-20px;
}

</style>
<div id="myCarousel" class="carousel slide">
    <!-- 轮播（Carousel）指标 -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>   
    <!-- 轮播（Carousel）项目 -->
    <div class="carousel-inner">
        <div class="item active">
            <a href="<c:url value="project_detail"/>"><img src="resource/img/slide1.jpg" style="margin:0px auto;cursor:pointer" alt="First slide"></a>
        </div>
        <div class="item" >
            <img src="resource/img/slide2.jpg" style="margin:0px auto;" alt="Second slide">
        </div>
    </div>
    <!-- 轮播（Carousel）导航 -->
    <a class="carousel-control left" href="#myCarousel" 
        data-slide="prev">&lsaquo;
    </a>
    <a class="carousel-control right" href="#myCarousel" 
        data-slide="next">&rsaquo;
    </a>
</div>

<ul class="nav nav-pills " style="padding-left:55px;margin:20px auto">
	<li><a href="#">类型：</a></li>
	<li class="active"><a href="#">SVN</a></li>
	<li><a href="#">iOS</a></li>
	<li><a href="#">VB.Net</a></li>
	<li><a href="#">Java</a></li>
	<li><a href="#">PHP</a></li>
</ul>
<style>
	#project_container{
		padding:0px;
	}
	.pro_panel{
		height:350px;
		margin-left:2.5%;
		width:30%;
	}
	.pro_img{
		padding:0px;
	}
	.pro_info{
		margin-left:20px;
	}
	span.money{
		margin-left:80px;
		font-size:20px;
	}
	span.status{
		margin-left:20px;
	}
	
</style>
<div id="project_container" class="container">
	 <c:forEach var="item" items="${list}">  
		<div class="pro_panel panel panel-default   pull-left">
		    <div class="text-info pro_img panel-body">
		        <img alt="项目图片" class=" pro_img img-thumbnail"src="resource/img/item1.jpg">
		        <div class="pro_info">
		        	<h3><c:out value="${item.name}"/></h3>
		        	<span>项目周期:50天</span><span class="status">招募中</span><span class="money text-warning">¥<c:out value="${item.age}"/></span>
		        </div>
		    </div>
		</div>
	</c:forEach>
</div>

