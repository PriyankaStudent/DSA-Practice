import java.util.Stack;
class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");
        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                continue;
            } else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(component);
            }
        }
        StringBuilder canonicalPath = new StringBuilder();
        for (String dir : stack) {
            canonicalPath.append("/").append(dir);
        }
        return canonicalPath.length() > 0 ? canonicalPath.toString() : "/";
    }
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/home/user/Documents/../Pictures")); 
        System.out.println(simplifyPath("/../")); 
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
    }
}
