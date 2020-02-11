<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <body>
                <h2>Publishers</h2>
                <table border="1">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Contact</th>
                        <th>Phone</th>
                    </tr>
                    <xsl:for-each select="LibraryData/publishers/publisher">
                        <tr>
                            <td><xsl:value-of select="@id"/></td>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="contact"/></td>
                            <td><xsl:value-of select="phone"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <h2>Authors</h2>
                <table border="1">
                    <tr>
                        <th>ID</th>
                        <th>Last Name</th>
                        <th>First Name</th>
                    </tr>
                    <xsl:for-each select="LibraryData/authors/author">
                        <tr>
                            <td><xsl:value-of select="@id"/></td>
                            <td><xsl:value-of select="lastName"/></td>
                            <td><xsl:value-of select="firstName"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <h2>Books</h2>
                <table border="1">
                    <tr>
                        <th>ISBN</th>
                        <th>Title</th>
                        <th>Published Date</th>
                        <th>Publisher ID</th>
                        <th>Cost</th>
                        <th>Retail</th>
                        <th>Discount</th>
                        <th>Category</th>
                    </tr>
                    <xsl:for-each select="LibraryData/books/book">
                        <tr>
                            <td><xsl:value-of select="@isbn"/></td>
                            <td><xsl:value-of select="title"/></td>
                            <td><xsl:value-of select="datePublished"/></td>
                            <td><xsl:value-of select="publisherId"/></td>
                            <td><xsl:value-of select="cost"/></td>
                            <td><xsl:value-of select="retail"/></td>
                            <td><xsl:value-of select="discount"/></td>
                            <td><xsl:value-of select="category"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <h2>Book Authors</h2>
                <table border="1">
                    <tr>
                        <th>ISBN</th>
                        <th>Author ID</th>
                    </tr>
                    <xsl:for-each select="LibraryData/bookAuthors/bookAuthor">
                        <tr>
                            <td><xsl:value-of select="@isbn"/></td>
                            <td><xsl:value-of select="@id"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>