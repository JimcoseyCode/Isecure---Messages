.class Lcom/facebook/drawee/drawable/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/drawee/drawable/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/drawee/drawable/a;->a(I)Lcom/facebook/drawee/drawable/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:I

.field final synthetic h:Lcom/facebook/drawee/drawable/a;


# direct methods
.method constructor <init>(Lcom/facebook/drawee/drawable/a;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/drawee/drawable/a$a;->h:Lcom/facebook/drawee/drawable/a;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/drawee/drawable/a$a;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a$a;->h:Lcom/facebook/drawee/drawable/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/drawee/drawable/a$a;->g:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/drawable/a;->b(I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a$a;->h:Lcom/facebook/drawee/drawable/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/drawee/drawable/a$a;->g:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/facebook/drawee/drawable/a;->e(ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
