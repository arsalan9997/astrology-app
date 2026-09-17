<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Astrology App</title>
    <style>
        body { font-family: Arial; background:#f2f2f2; text-align:center; padding-top:50px; }
        .container { width:400px; margin:auto; background:white; padding:30px; border-radius:10px; }
        input { width:90%; padding:10px; margin:10px; box-sizing:border-box; }
        button { padding:12px 25px; cursor:pointer; }
    </style>
</head>
<body>
<div class="container">
    <h1>🔮 Astrology App</h1>
    <p>Enter your details</p>
    <form action="predict" method="post">
        <input type="text" name="name" placeholder="Your Name" required><br>
        <input type="date" name="dob" required><br>
        <input type="text" name="birthPlace" placeholder="Birth Place" required><br>
        <button type="submit">Generate Prediction</button>
    </form>
</div>
</body>
</html>
