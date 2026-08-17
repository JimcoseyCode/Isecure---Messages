.class Lcom/github/penfeizhou/animation/glide/b$c;
.super LF1/j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/penfeizhou/animation/glide/b;->transcode(Lx1/v;Lv1/h;)Lx1/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic h:LL3/a;

.field final synthetic i:Lcom/github/penfeizhou/animation/glide/b;


# direct methods
.method constructor <init>(Lcom/github/penfeizhou/animation/glide/b;Landroid/graphics/drawable/Drawable;LL3/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/penfeizhou/animation/glide/b$c;->i:Lcom/github/penfeizhou/animation/glide/b;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/github/penfeizhou/animation/glide/b$c;->h:LL3/a;

    .line 4
    .line 5
    invoke-direct {p0, p2}, LF1/j;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/glide/b$c;->h:LL3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LD3/a;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public initialize()V
    .locals 0

    .line 1
    invoke-super {p0}, LF1/j;->initialize()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/glide/b$c;->h:LL3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LD3/a;->stop()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
