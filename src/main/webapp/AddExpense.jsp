<html>
    <body>
        <h2>Add your expense here</h2>
        <div>
            <form action = "/add" method = "POST">
                Day :                 <input type = 'number' name = 'day' />
                <br><br>
                Month :               <input type = 'number' name = 'month' />
                <br><br>
                Year :                <input type = 'number' name = 'year' />
                <br><br>
				Category : 	          <select  name="category">
							              <!-- Individual Options -->
							              <option value="food">food</option>
							              <option value="electronics">electronics</option>
							              <option value="miscellaneous">miscellaneous</option>
							              <!-- Add more options as needed -->
							          </select>
                <br><br>
                Description :         <input type = 'text' name = 'description' />
                <br><br>
                Cost :                <input type = 'number' name = 'cost' />
                <br><br>
                <input type = 'submit' value = 'submit' />
            </form>
        </div>
        <br><br>
        ${message}
    </body>
</html>