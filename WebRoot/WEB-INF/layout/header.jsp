<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<style>
    body{
        background: #f2dede;
    }
    nav{
        padding:0 30px;
        margin-bottom:0px;
    }
    .nav_btn_my{
        margin-top:20px;
    }
</style>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a href="<c:url value="index"/>"><img src="resource/img/logo-noback.png"   style="width:150px; height:auto;"/></a>

        </div>
        <div>
            <p class="navbar-text pull-right">
            <button type="button" class="btn nav_btn_my btn-primary btn-sm pull-right">
                <span class="glyphicon glyphicon-user"></span> 登录
            </button>
            </p>
            <p class="navbar-text pull-right">
                <button type="button" class="btn nav_btn_my  btn-primary btn-sm pull-right">
                    <span class="glyphicon glyphicon-user"></span> 注册
                </button>
        </div>
    </div>
</nav>