package selenium;

public class XpathAxes {

	/* XPath axes are used to navigate through elements in an XML or HTML document relative to the current node. Here is a list of all XPath axes along with their usages:

		1. Ancestor
		Usage: Selects all ancestors (parent, grandparent, etc.) of the current node.
		Example: ancestor::div selects all ancestor <div> elements of the current node.
		2. Ancestor-or-self
		Usage: Selects all ancestors (parent, grandparent, etc.) of the current node and the node itself.
		Example: ancestor-or-self::div selects all ancestor <div> elements and the current node if it is a <div>.
		3. Attribute
		Usage: Selects all attributes of the current node.
		Example: attribute::class selects the class attribute of the current node.
		4. Child
		Usage: Selects all child elements of the current node.
		Example: child::span selects all child <span> elements of the current node.
		5. Descendant
		Usage: Selects all descendants (children, grandchildren, etc.) of the current node.
		Example: descendant::p selects all descendant <p> elements of the current node.
		6. Descendant-or-self
		Usage: Selects all descendants (children, grandchildren, etc.) of the current node and the node itself.
		Example: descendant-or-self::p selects all descendant <p> elements and the current node if it is a <p>.
		7. Following
		Usage: Selects all nodes that come after the current node in the document, excluding descendants.
		Example: following::div selects all <div> elements that come after the current node.
		8. Following-sibling
		Usage: Selects all siblings after the current node.
		Example: following-sibling::li selects all <li> siblings that come after the current node.
		9. Namespace
		Usage: Selects all namespace nodes of the current node (rarely used).
		Example: namespace::* selects all namespace nodes of the current node.
		10. Parent
		Usage: Selects the parent of the current node.
		Example: parent::div selects the parent <div> of the current node.
		11. Preceding
		Usage: Selects all nodes that come before the current node in the document, excluding ancestors.
		Example: preceding::input selects all <input> elements that come before the current node.
		12. Preceding-sibling
		Usage: Selects all siblings before the current node.
		Example: preceding-sibling::li selects all <li> siblings that come before the current node.
		13. Self
		Usage: Selects the current node itself.
		Example: self::node() selects the current node.
		14. Closest
		Usage: Selects the nearest ancestor that matches the provided node.
		Example: ancestor::div[1] selects the closest ancestor <div> element. */

}
