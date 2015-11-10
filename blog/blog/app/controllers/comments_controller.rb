class CommentsController < ApplicationController
  def create
  	@post = Post.find(params[:post_id])
  	@comment = @post.comments.new(post_params)
  	@comment.save

  	redirect_to @post
  end

  def destroy
  end

  private
  	def post_params
  		params.require(:comment).permit(:text)
  	end
  	
end
