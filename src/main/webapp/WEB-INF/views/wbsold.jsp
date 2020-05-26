<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>KIMSCHOOL ||  WBS</title>
</head>
<body>


<fieldset style="width: 300px;">
	<legend>
		KIMSCHOOL 勤怠管理
	</legend>

	<table border=1>
			<tr>
				<th style="background-color: lightblue;">社員名</th><td>${wbsinfo.name}</td>
			</tr>
			<tr>
				<th style="background-color: lightblue;">社員番号</th><td>${wbsinfo.u_no}</td>
			</tr>
	</table>

	<br>

	<table border=1>
		<tr>
			<th style="background-color: lightblue;">勤務日合計</th><td>17日</td>
		</tr>
		<tr>
			<th style="background-color: lightblue;">勤務時間合計</th><td>134時間</td>
		</tr>
	</table>

	<br>

	<table border=1>
			<tr>
				<th style="background-color: lightblue;">最低勤務時間</th><td>${wbsinfo.min_time}</td>
			</tr>
			<tr>
				<th style="background-color: lightblue;">最大勤務時間</th><td>${wbsinfo.max_time}</td>
			</tr>
	</table>
</fieldset>

<br>

<table border=1>
	<tr style="background-color: lightblue">
		<th>日付<th>開始時間</th><th>終了時間</th><th>合計時間</th><th>休日区分</th><th>メモ</th>
	</tr>
	<c:forEach items="${wbsinfo.wbs_2020List}" var="list">
		<tr>
			<td>${list.date}</td>
			<td>${list.start_time}</td>
			<td>${list.end_time}</td>
			<td>${list.end_time - list.start_time - list.rest_time}</td>
			<td>${list.vacation_type}</td>
			<td>${list.memo}</td>
		</tr>
	</c:forEach>	
	<tr>
		<td>2020-05-20</td>
		<td>
			<select><option>00</option><option>09</option><option>10</option></select>時
			<select><option>00</option><option>15</option><option>30</option><option>45</option></select>分
		</td>
		<td>
			<select><option>00</option><option>18</option><option>19</option></select>時
			<select><option>00</option><option>15</option><option>30</option><option>45</option></select>分
		</td>
		<td>0時間</td>
		<td><select><option>--</option><option>午前休暇</option><option>午後休暇</option><option selected="selected">全休</option><option>早退</option></select></td>
		<td>----</td>
	</tr>

</table>
<input type = "button" value = "등록">

</body>
</html>