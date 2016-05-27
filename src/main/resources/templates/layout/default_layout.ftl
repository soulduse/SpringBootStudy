<#macro defaultLayout title="Rakuten-arc">
<html>
<head>
    <title>
        <#--${title}-->
        <h1>타이틀</h1>
    </title>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.6/dist/css/bootstrap.min.css">
</head
<body id="main_body">
    <div id="header">
        <#include "./header.ftl"/>
    </div>

    <div id="nav">
        <#include "./center.ftl"/>
    </div>

    <div id="nav">
        <#include "./menu.ftl"/>
    </div>

    <div id="footer">
        <#include "./footer.ftl"/>
    </div>

    <script src="webjars/jquery/2.2.3/dist/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/dist/js/bootstrap.min.js"></script>
</body>
</html>
</#macro>