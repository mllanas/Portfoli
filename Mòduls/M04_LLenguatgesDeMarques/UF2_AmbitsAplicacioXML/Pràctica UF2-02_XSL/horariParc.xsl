<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>
                    <xsl:value-of select="parc/@nom"/>
                </title>
                <link rel="stylesheet" type="text/css" href="horariParc.css"/>
            </head>
            
            <body>
                <header class="capcalera">
                    <span>
                        <img alt="logoParc" width="50" height="50">
                            <xsl:attribute name="src"> 
                                <xsl:value-of select="parc/@logo"/>
                            </xsl:attribute>
                        </img>
                    </span>
                    <span class="nom">
                        <xsl:value-of select="parc/@nom"/>
                    </span>
                </header>
                <header class="dades">
                    Obrim del <xsl:value-of select="parc/dates/dataObertura"/> al <xsl:value-of select="parc/dates/dataTancament"/>
                </header>
                <header class="mes">
                    <xsl:value-of select="parc/horaris/mes[last()-2]/@nom"/>
                </header>
                
                <section>
                    <table>
                        <tr>
                            <th><xsl:value-of select="parc/horaris/mes/periode/diaSetmana"/></th>
                            <th><xsl:value-of select="parc/horaris/mes/periode/diaSetmana[2]"/></th>
                            <th><xsl:value-of select="parc/horaris/mes/periode/diaSetmana[3]"/></th>
                            <th><xsl:value-of select="parc/horaris/mes/periode/diaSetmana[4]"/></th>
                            <th><xsl:value-of select="parc/horaris/mes/periode/diaSetmana[5]"/></th>
                            <th><xsl:value-of select="parc/horaris/mes/periode/diaSetmana[6]"/></th>
                            <th><xsl:value-of select="parc/horaris/mes/periode/diaSetmana[7]"/></th>
                        </tr>
                        <xsl:for-each select="parc/horaris/mes[last()-2]/periode">
                            <tr>
                                <xsl:for-each select="diaSetmana">
                                    <td>
                                        <xsl:if test="@diaMes">                               
                                            <div class="dia">
                                                <xsl:value-of select="@diaMes"/>
                                            </div>
                                            <xsl:choose>                            
                                                <xsl:when test="@diaMes and @horaObertura">
                                                    <div>
                                                        <xsl:value-of select="@horaObertura"/> - <xsl:value-of select="@horaTancament"/>
                                                    </div>
                                                </xsl:when>                                
                                                <xsl:otherwise>
                                                    <div>TANCAT</div>
                                                </xsl:otherwise>
                                            </xsl:choose>
                                        </xsl:if> 
                                    </td>
                                </xsl:for-each>                           
                            </tr>
                        </xsl:for-each>
                    </table>
                </section>
                
                <footer class="dades">
                    <div>
                        <xsl:value-of select="parc/adreca"/>
                    </div>
                    <div>
                        <xsl:value-of select="parc/ciutat"/> - <xsl:value-of select="parc/pais"/>
                    </div>
                    <div>
                        web: 
                        <a>
                            <xsl:attribute name="href">
                                <xsl:value-of select="parc/paginaWeb"/>
                            </xsl:attribute>
                            <xsl:value-of select="parc/paginaWeb"/>
                        </a> 
                    </div>
                </footer>
                
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
