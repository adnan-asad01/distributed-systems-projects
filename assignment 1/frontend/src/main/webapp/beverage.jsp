<%@ page import="java.util.*" %>
<%@ page import="de.uniba.dsg.dsam.model.Beverage" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Room Management Demo</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body>
<div class="container">

	<div class="row">
		<div class="col-md-4"><h3>Room Name</h3></div>
		<div class="col-md-4"><h3>m&sup2;</h3></div>
		<div class="col-md-4"></div>
	</div>


    <div class="row">
        <div class="col-md-4"><h4><%= room.getUsername() %>
        </h4></div>
        <div class="col-md-4"><h4><%= room.getPassword() %>
        </h4></div>
        <div class="col-md-4">
            <div class="btn-group" data-toggle="buttons">
                <label id="<%= room.getId() %>" class="assign btn btn-default active">
                    <input type="radio" name="options" autocomplete="off" checked>Assign
                </label>
                <label id="<%= room.getId() %>" class="btn btn-default">
                    <input type="radio" name="options" autocomplete="off">Remove
                </label>
            </div>
        </div>
    </div>
    <% } %>
</div>

<script>
	$(document).ready(function() {
		$(".btn-group .btn").on("click", function(event) {
			event.preventDefault();

			if(!$(this).hasClass('active')) {
				if($(this).hasClass('assign')) {
					$.ajax({
						url: '/frontend/all?room_id=' + event.target.id,
						type: 'PUT',
						success: function(response) {
							alert("Assigned Room.");
						}
					});
				} else {
					$.ajax({
						url: '/frontend/all?room_id=' + event.target.id,
						type: 'DELETE',
						success: function(response) {
							alert("Deleted Room.");
						}
					});
				}
				$(this).siblings('.btn').andSelf().toggleClass('active');
			}

		});
	});
</script>


</body>
</html>