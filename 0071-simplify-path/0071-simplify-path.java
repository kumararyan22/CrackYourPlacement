
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        // Split the input by "/"
        String[] components = path.split("/");

        // Process each component
        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                // Skip empty components (caused by //) and current directory "."
                continue;
            }
             else if (component.equals("..")) 
             {
                // ".." means go back one directory (pop the stack)
                if (!stack.isEmpty())
                 {
                    stack.pop();
                 }
            } 
            else
             {
                // It's a valid directory name, push it to the stack
                stack.push(component);
             }
        }

    
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        if(simplifiedPath.length() == 0)  //is Empty()
        {
            return "/";
        }

        return simplifiedPath.toString();  //otherwise return
    }
}
