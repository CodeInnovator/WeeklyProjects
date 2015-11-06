class CommentsController < ApplicationController
  def create
  	@post = Post.find(params[:post_id])
  	@comment = @post.comments.build(params[:comment].permit)
  	@comment.save

  	redirect_to @post
  end

  def destroy
  end
end
