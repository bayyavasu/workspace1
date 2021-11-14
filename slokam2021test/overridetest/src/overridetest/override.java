package overridetest;

import java.io.FileNotFoundException;
import java.io.IOException;

class override {
 Object A() throws FileNotFoundException
{
	 return null;
}

}
class over extends override{
 Object A() throws Exception
{
	return null;
}
}
