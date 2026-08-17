.class public interface abstract LB/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB/a$b;
    }
.end annotation


# static fields
.field public static final a:LB/a$b;

.field public static final b:LB/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LB/a$b;->a:LB/a$b;

    .line 2
    .line 3
    sput-object v0, LB/a;->a:LB/a$b;

    .line 4
    .line 5
    new-instance v0, LB/a$a;

    .line 6
    .line 7
    invoke-direct {v0}, LB/a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LB/a;->b:LB/a;

    .line 11
    .line 12
    return-void
.end method

.method public static b(LF/D1;Landroid/util/Size;Ly/H;)LF/k1$b;
    .locals 1

    .line 1
    sget-object v0, LB/a;->a:LB/a$b;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, LB/a$b;->a(LF/D1;Landroid/util/Size;Ly/H;)LF/k1$b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public abstract a(LF/k1;)Z
.end method
