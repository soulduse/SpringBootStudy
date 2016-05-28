<!DOCTYPE HTML>
<html>

<head>
    <title>testpage</title>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.6/dist/css/bootstrap.min.css">
</head>

<body>
    <div class="container">
        <form class="form-signin" action="create" method="post">
            <h2 class="form-signin-heading">회원가입</h2>
            <label for="inputUsername" class="sr-only">Username</label>
            <input type="text" id="name" class="form-control" placeholder="별명" required="" autofocus="">
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="email" class="form-control" placeholder="이메일" required="">
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="password" class="form-control" placeholder="비밀번호" required="">
            <button class="btn btn-lg btn-primary btn-block" type="submit">회원가입</button>
        </form>
    </div>

    <script src="webjars/jquery/2.2.3/dist/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/dist/js/bootstrap.min.js"></script>
</body>
</html>