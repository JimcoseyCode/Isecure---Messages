.class public final LY/g$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY/g;->v(Landroid/content/Context;Ly/D;)Lm5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/g;

.field final synthetic b:Ly/C;

.field final synthetic c:Landroid/content/Context;


# direct methods
.method constructor <init>(LY/g;Ly/C;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/g$b;->a:LY/g;

    .line 2
    .line 3
    iput-object p2, p0, LY/g$b;->b:Ly/C;

    .line 4
    .line 5
    iput-object p3, p0, LY/g$b;->c:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    .line 1
    iget-object p1, p0, LY/g$b;->a:LY/g;

    .line 2
    .line 3
    iget-object v0, p0, LY/g$b;->b:Ly/C;

    .line 4
    .line 5
    invoke-static {p1, v0}, LY/g;->m(LY/g;Ly/C;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LY/g$b;->a:LY/g;

    .line 9
    .line 10
    iget-object v0, p0, LY/g$b;->c:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, LH/f;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, LY/g;->B(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "t"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LY/g$b;->a:LY/g;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, LY/g;->C(Z)Lm5/a;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LY/g$b;->a(Ljava/lang/Void;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
