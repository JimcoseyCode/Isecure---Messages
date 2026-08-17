.class LW2/w$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lg2/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW2/w;->w(LW2/n$a;)Lg2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LW2/n$a;

.field final synthetic b:LW2/w;


# direct methods
.method constructor <init>(LW2/w;LW2/n$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW2/w$b;->b:LW2/w;

    .line 2
    .line 3
    iput-object p2, p0, LW2/w$b;->a:LW2/n$a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public release(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p0, LW2/w$b;->b:LW2/w;

    .line 2
    .line 3
    iget-object v0, p0, LW2/w$b;->a:LW2/n$a;

    .line 4
    .line 5
    invoke-static {p1, v0}, LW2/w;->h(LW2/w;LW2/n$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
