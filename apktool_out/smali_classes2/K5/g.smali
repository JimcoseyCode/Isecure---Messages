.class public final synthetic LK5/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lq5/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:LK5/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LK5/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK5/g;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LK5/g;->b:LK5/h$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lq5/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LK5/g;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LK5/g;->b:LK5/h$a;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LK5/h;->a(Ljava/lang/String;LK5/h$a;Lq5/d;)LK5/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
