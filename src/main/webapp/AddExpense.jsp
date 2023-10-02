<html>
	<head>
		<link rel = 'stylesheet' href = "./AddExpense_page_style.css">
	</head>
    <body>
        <h2>Add your expense here</h2>
        <div>
            <form action = "/add" method = "POST">
                Day :                 <input id = 'day' type = 'number' name = 'day' />
                <br><br>
                Month :               <input id = 'month' type = 'number' name = 'month' />
                <br><br>
                Year :                <input id = 'year' type = 'number' name = 'year' />
                <br><br>
				Category : 	          <select  name="category">
							              <!-- Individual Options -->
							              <option value="grocery">grocery</option>
							              <option value="outside food">outside food</option>
							              <option value="electronics">electronics</option>
							              <option value="transfer">transfer</option>
							              <option value="apparel">apparels</option>
							              <option value="shoes">shoes</option>
							              <option value="kitchen apppliance">kitchen appliance</option>
							              <option value="fare">fare</option>
							              <option value="entertainment">entertainment</option>
							              <option value="maid & cook">maid and cook</option>
							              <option value="miscellaneous">miscellaneous</option>
							              <!-- Add more options as needed -->
							          </select>
                <br><br>
                Description :         <input id = 'description' type = 'text' name = 'description' />
                <br><br>
                Cost :                <input id = 'cost' type = 'number' name = 'cost' />
                <br><br>
                <input  id = 'submit' type = 'submit' value = 'submit' />
            </form>
        </div>
        <br><br>
        ${message}
        <script src = "./AddExpense_page_script.js">	</script>
    </body>
</html>