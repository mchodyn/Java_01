<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="get">
		<label>Imię:<input type="text" name="name" required="required" /></label><br>
		<label>Nazwisko:<input type="text" name="surname" required="required" /></label><br>
		<label>Pracodawca:<input type="text" name="employment" required="required" /></label><br>
		<label>Adres email:<input type="text" name="email" required="required" /></label><br>
		<label>Potwierdz adres email:<input type="text" name="confrimemail" required="required" /></label><br>
		<label>Skąd się dowiedziałes o konferencji:</label><br>
		<label>Ogłoszenie w pracy<input type="radio" name="info" value="work"></label><br>
		<label>Ogłoszenie na uczelni<input type="radio" name="info" value="school"></label><br>
		<label>Facebook<input type="radio" name="info" value="facebook"></label><br>
		<label>Znajomi<input type="radio" name="info" value="friends"></label><br>
		<input type="submit" value="wyslij"/>
	</form>
</body>
</html>