/* Generated By:JJTree: Do not edit this line. ASTOrExpression.java */

package org.apache.jackrabbit.spi.commons.query.sql;

public class ASTOrExpression extends SimpleNode {
  public ASTOrExpression(int id) {
    super(id);
  }

  public ASTOrExpression(JCRSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JCRSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}