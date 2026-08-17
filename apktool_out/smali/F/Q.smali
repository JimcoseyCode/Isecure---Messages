.class public final synthetic LF/Q;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/lifecycle/B;


# instance fields
.field public final synthetic a:LF/U;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LF/U;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/Q;->a:LF/U;

    .line 5
    .line 6
    iput-object p2, p0, LF/Q;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF/Q;->a:LF/U;

    .line 2
    .line 3
    iget-object v1, p0, LF/Q;->b:Ljava/lang/String;

    .line 4
    .line 5
    check-cast p1, Ly/t;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, LF/U;->a(LF/U;Ljava/lang/String;Ly/t;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
