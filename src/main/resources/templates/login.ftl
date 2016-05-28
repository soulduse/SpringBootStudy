<!DOCTYPE HTML>
<html>

<head>
    <title>testpage</title>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.6/dist/css/bootstrap.min.css">
</head>

<body>
    <div class="container">
        <form class="form-signin">
            <h2 class="form-signin-heading">Please sign in</h2>
            <input type="email" id="inputEmail" class="form-control" placeholder="이메일" required="" autofocus="">
            <input type="password" id="inputPassword" class="form-control" placeholder="비밀번호" required="">
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> 이메일 저장
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
        </form>

        <form class="form-signin" action="join">
            <button class="btn btn-lg btn-primary btn-block" type="submit">회원가입</button>
        </form>
    </div>

    <script src="webjars/jquery/2.2.3/dist/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/dist/js/bootstrap.min.js"></script>
</body>
</html>