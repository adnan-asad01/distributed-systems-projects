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
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h1>New Beverage</h1>

    <p>&nbsp;</p>

    <form role="form" action="/frontend/new" method="post">
        <div class="form-group">
            <div class="input-group">
                <span class="input-group-addon">Beverage name</span>
                <input name="div_name" type="text" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <div class="input-group">
                <span class="input-group-addon">Beverage manufacturer name</span>
                <input name="div_manu_name" type="text" class="form-control">
            </div>
        </div>

        <div class="form-group">
            <div class="input-group">
                <span class="input-group-addon">Quantity</span>
                <input name="div_quantity" type="text" class="form-control">
            </div>
        </div>

        <div class="form-group">
            <div class="input-group">
                <span class="input-group-addon">Price</span>
                <input name="div_price" type="text" class="form-control">
            </div>
        </div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon">Select Incentive</span>
				<select name="selectIncentive">
					<option value="1">Promotional</option>
					<option value="2">Trial</option>

				</select>
			</div>
		</div>

        <a href="/frontend/" class="btn btn-default">Cancel</a>
        <button type="submit" class="btn btn-success">Save</button>
    </form>

</div>
</body>
</html>