.class final Lx1/h$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lx1/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Lv1/a;

.field final synthetic b:Lx1/h;


# direct methods
.method constructor <init>(Lx1/h;Lv1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/h$c;->b:Lx1/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lx1/h$c;->a:Lv1/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lx1/v;)Lx1/v;
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/h$c;->b:Lx1/h;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/h$c;->a:Lv1/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lx1/h;->G(Lv1/a;Lx1/v;)Lx1/v;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
