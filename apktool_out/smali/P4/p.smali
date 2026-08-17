.class final LP4/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP4/h;


# instance fields
.field final synthetic a:LP4/i;


# direct methods
.method constructor <init>(LP4/t;LP4/i;)V
    .locals 0

    .line 1
    iput-object p2, p0, LP4/p;->a:LP4/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p1, p0, LP4/p;->a:LP4/i;

    .line 4
    .line 5
    invoke-interface {p1}, LP4/i;->onCanceled()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
