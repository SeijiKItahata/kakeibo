<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>家計簿 - 入力フォーム</title>
</head>
<body>
    <h1>家計簿入力フォーム</h1>
    <form action="KakeiboServlet" method="post">
        <label>品目：</label>
        <input type="text" name="item"><br><br>

        <label>金額：</label>
        <input type="number" name="amount"><br><br>

        <input type="submit" value="登録">
    </form>
</body>
</html>
