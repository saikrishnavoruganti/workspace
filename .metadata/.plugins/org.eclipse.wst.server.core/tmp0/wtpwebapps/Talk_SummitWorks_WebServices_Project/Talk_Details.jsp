<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--Home.html-->
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "style.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		
		$("#ret").on("click", function()
		{
			var talkId = $("#talkId").val();
			$.get("Rest/getTalk/get?"+"talkId=" + talkId, function(data, status){
				$('#talkName').val(data.name);
				$('#talkSpeaker').val(data.speaker);
				$('#talkVenue').val(data.venue);
				$('#talkDuration').val(data.duration);
			});
		});
		
		$("#retAll").on("click", function()
		{
			$('#table').find("tr:gt(0)").remove();
			
			$.get("Rest/getAll/get", function(data, status){
			
				if(data){
		            var len = data.length;
		            var txt = "";
		            if(len > 0){
		                for(var i=0;i<len;i++){
		                        txt += "<tr><td>"+data[i].id+"</td><td>"+data[i].name+"</td><td>"+data[i].speaker+"</td><td>"+data[i].venue+"</td><td>"+data[i].duration+"</td></tr>";
		                   }
		                if(txt != ""){
		                    $("#table").append(txt).removeClass("hidden");
		                }
		            }
		  	   }
			});		
		});
		
		$("#addTalk").on("click", function()
		{
			var talkId = $("#talkId").val();
			var talkName = $("#talkName").val();
			var talkSpeaker = $("#talkSpeaker").val();
			var talkVenue = $("#talkVenue").val();
			var talkDuration = $("#talkDuration").val();
			
			var talk = {id:talkId, name:talkName, speaker:talkSpeaker, 
					    venue:talkVenue, duration:talkDuration}
			
			$.ajax({
				  type: "POST",
				  headers: { 
				        'Accept': 'application/json',
				        'Content-Type': 'application/json' 
				    },
				  url: "Rest/insertTalk/talk",
				  data: JSON.stringify(talk),
				  success: function(data, status)
					{
						alert(data);
					},
				  dataType: "text"
				});		
		});	
		
		$("#updateTalk").on("click", function()
		{
			var talkId = $("#talkId").val();
			var talkName = $("#talkName").val();
			var talkSpeaker = $("#talkSpeaker").val();
			var talkVenue = $("#talkVenue").val();
			var talkDuration = $("#talkDuration").val();
			
			var talk = {id:talkId, name:talkName, speaker:talkSpeaker, 
				    venue:talkVenue, duration:talkDuration}
		
		$.ajax({
			  type: "POST",
			  headers: { 
			        'Accept': 'application/json',
			        'Content-Type': 'application/json' 
			    },
			  url: "Rest/updateTalk/talk",
			  data: JSON.stringify(talk),
			  success: function(data, status)
				{
					alert(data);
				},
			  dataType: "text"
			});
		});
		
		$("#removeTalk").on("click", function()
		{
					var talkId = $("#talkId").val();
					
					var talk = {id:talkId}
					
					$.ajax({
						  type: "POST",
						  headers: { 
						        'Accept': 'application/json',
						        'Content-Type': 'application/json' 
						    },
						  url: "Rest/removeTalk/talk",
						  data: JSON.stringify(talk),
						  success: function(data, status)
							{
								alert(data);
							},
						  dataType: "text"
						});	
		});	
	});
</script>
</head>
<body>
	<center>
		<h1>Talk Details</h1>
	</center>
	<table border="1" width="100%" height="100%">
		<tr>
			<td valign="top" align="center"><br />
				<form>
					<table>
						<tbody>
						<!--<tr>
							<td colspan="2" align="center"><b>Login Page</b></td>
						</tr>-->
						<tr>
							<td colspan="2" align="center"><b>&nbsp;</td>
						</tr>
						<tr>
							<td>Talk ID:</td>
							<td><input id="talkId" type="text" name="talkId" /></td>
						</tr>
						<tr>
							<td>Name:</td>
							<td><input id="talkName" type="text" name="talkName" /></td>
						</tr>
						<tr>
							<td>Speaker:</td>
							<td><input id="talkSpeaker" type="text" name="talkSpeaker" /></td>
						</tr>
						<tr>
							<td>Venue:</td>
							<td><input id="talkVenue" type="text" name="talkVenue" /></td>
						</tr>
						<tr>
							<td>Duration:</td>
							<td><input id="talkDuration" type="text" name="talkDuration" /></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="left">
								<input type="button" id="addTalk" value="Add Talk" />
							</td>
							<td align="left"><input class="style" type="button" id="updateTalk"
								value="Update Talk" /></td>	
							<td align="left"><input class="styleGetTalk" type="button" id="ret" 
								value="Get Talk" /></td>	
							<td align="left"><input class="style" type="button" id="removeTalk"
								value="Remove Talk" /></td>	
							<td align="left"><input class="style" type="button" id="retAll"
								value="Get All Talk" /></td>
						</tr>
						<table id="table" class="hidden" style="margin-top:50px;">
						    <tr>
						        <th>Talk Id</th>
						        <th>Name</th>
						        <th>Speaker</th>
						        <th>Venue</th>
						        <th>Duration</th>
						    </tr>
						  </tbody>	 
						</table>
					</table>
				</form></td>
		</tr>
	</table>
</body>
</html>

