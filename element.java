
WebElement searchBox = driver.findElement(By.name("btnX"));
searchBox.click();

driver.findElement(By.id("btnX"));

List<WebElement> buttons = driver.findElement(By.tagName("button"));
System.out.println(buttons.size());

driver.findElement(By.className("btnX"));

driver.findElement(By.linkText("超链接"));
driver.findElement(By.partialLinkText("链接"));//关键字匹配

driver.findElement(By.xpath(""));
driver.findElement(By.xpath("//a[contains(@href, 'logout')]"));//href属性包含logout值的所有a标签
driver.findElement(By.xpath("//a[starts-with(@rel, 'nofo')])");
driver.findElement(By.xpath("//*[text()='退出''])");
driver.findElement(By.xpath("//a[contains(text(), '退出'')])");

driver.findElement(By.cssSelector("#J_login_form>dl>dt>input[id=’ J_password’]"));
driver.findElement(By.cssSelector("button.btn.btn_big.btn_submit"));//button采用了复合样式分别为btn/btn_big/btn_submit


此外，cssSelector还有一些高级用法，如果熟练后可以更加方便地帮助我们定位元素，如我们可以利用^用于匹配一个前缀，$用于匹配一个后缀，*用于匹配任意字符。例如：
匹配一个有id属性，并且id属性是以”id_prefix_”开头的超链接元素：a[id^='id_prefix_']
匹配一个有id属性，并且id属性是以”_id_sufix”结尾的超链接元素：a[id$='_id_sufix']
匹配一个有id属性，并且id属性中包含”id_pattern”字符的超链接元素：a[id*='id_pattern']





