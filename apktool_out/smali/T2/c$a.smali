.class LT2/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW2/n$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT2/c;-><init>(LW1/d;LW2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LT2/c;


# direct methods
.method constructor <init>(LT2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT2/c$a;->a:LT2/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    check-cast p1, LW1/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LT2/c$a;->b(LW1/d;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(LW1/d;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LT2/c$a;->a:LT2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LT2/c;->f(LW1/d;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
