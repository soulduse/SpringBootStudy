<!DOCTYPE HTML>
<html>
<head>
    <title>${blogTitle}</title>
</head>
<body>
    <h1>${blogTitle}</h1>
    <p>${message}</p>

    <ul>
        <#list systems as system>
            <li>${system_index + 1}.${system.name} from ${system.developer}</li>
        </#list>
    </ul>

</body>
</html>